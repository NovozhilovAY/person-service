package liga.medical.personservice.core.api;

public interface LogService {
    void logRest(String className, String methodName);

    void logAuth(String username);
}
