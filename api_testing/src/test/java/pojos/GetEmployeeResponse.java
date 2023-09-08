package pojos;

public class GetEmployeeResponse {

    private String status;
    private DataOfGetResponse data;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataOfGetResponse getData() {
        return data;
    }

    public void setData(DataOfGetResponse data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
