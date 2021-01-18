package moe.kira.common.message;

import java.util.Optional;

public interface Response {
    public static final int DEFAULT_STATUS_CODE = 200;
    
    public Optional<String> getMessage();
    
    public void setMessage(String message);
    
    public int getStatusCode();
    
    public void setStatusCode(int statusCode);
}