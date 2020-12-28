package com.thinking.machines.hd.tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
import com.thinking.machines.hd.beans.*;
import com.thinking.machines.hd.dl.*;
public class HospitalsTagHandler extends BodyTagSupport
{
private List<HospitalBean> hospitals;
private int index;
public void setHospitals(List<HospitalBean> hospitals)
{
this.hospitals=hospitals;
}
public List<HospitalBean> getHospitals()
{
return this.hospitals;
}
public HospitalsTagHandler()
{
reset();
}
private void reset()
{
index=0;
}
public int doStartTag()
{
HospitalBean hospitalBean;
if(hospitals.size()==0)
{
return super.SKIP_BODY;
}
/*
index=0;
hospitalBean=hospitals.get(index);
pageContext.setAttribute("hospitalBean",hospitalBean,PageContext.REQUEST_SCOPE);
pageContext.setAttribute("serialNumber",new Integer(index+1),PageContext.REQUEST_SCOPE);
*/

return super.EVAL_BODY_INCLUDE;
}
public int doEndTag()
{
reset();
return super.EVAL_PAGE;
}
public int doAfterBody()
{
index++;
if(hospitals.size()==index) return super.SKIP_BODY;

/*
HospitalBean hospitalBean;
hospitalBean=hospitals.get(index);
pageContext.setAttribute("hospitalBean",hospitalBean,PageContext.REQUEST_SCOPE);
pageContext.setAttribute("serialNumber",new Integer(index+1));
*/

return super.EVAL_BODY_AGAIN;
}
}