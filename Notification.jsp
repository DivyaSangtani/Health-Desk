<jsp:useBean id='messageBean' scope='request' class='com.thinking.machines.hd.beans.MessageBean' />
<jsp:include page='/MasterPageTopSection.jsp'/>
</nav>
</div>
<div>
<h2>${messageBean.heading}</h2>
${messageBean.message}
<%
if(messageBean.getGenerateButtons()==true)
{
%>
<table>
<tr>
<td>
<form action='${messageBean.buttonOneAction}'>
<button>${messageBean.buttonOneText}</button>
</form>
</td>
<%
if(messageBean.getGenerateTwoButtons()==true)
{
%>
<td>
<form action='${messageBean.buttonTwoAction}'>
<button>${messageBean.buttonTwoText}</button>
</form>
</td>
<%
}
%>
</tr>
</table>
<%
}
%>
</div>
<jsp:include page='/MasterPageBottomSection.jsp'/>