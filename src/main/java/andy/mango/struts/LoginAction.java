package andy.mango.struts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -7531141371368879785L;

	private String userId;
	private String password;

	@Override
	public String execute() throws Exception {
		String userId = getUserId();
		String password = getPassword();
		System.out.println(String.format("userId = '%s', password = '%s'", userId, password));
		if ("andy".equals(userId) && "1".equals(password)) {
			ActionContext.getContext().getSession().put("userId", getUserId());
			return SUCCESS;
		}
		return ERROR;
	}

	// getter and setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
