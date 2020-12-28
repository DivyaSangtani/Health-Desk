package com.thinking.machines.hd.beans;
public class LoginBean implements java.io.Serializable
{
private boolean loginDone;
private boolean loginNotDone;
public LoginBean()
{
this.loginDone=false;
this.loginNotDone=true;
}
public void setLoginDone(boolean loginDone)
{
this.loginDone=loginDone;
}
public boolean getLoginDone()
{
return this.loginDone;
}
public void setLoginNotDone(boolean loginNotDone)
{
this.loginNotDone=loginNotDone;
}
public boolean getLoginNotDone()
{
return this.loginNotDone;
}

}