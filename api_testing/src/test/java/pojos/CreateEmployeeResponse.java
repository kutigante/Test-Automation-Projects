package pojos;

public class CreateEmployeeResponse {

    private String status ;
    private DataOfCreateResponse data;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataOfCreateResponse getData() {
        return data;
    }

    public void setData(DataOfCreateResponse data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
