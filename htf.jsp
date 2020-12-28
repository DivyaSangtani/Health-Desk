<jsp:useBean id='cityStateBean' scope='request' class='com.thinking.machines.hd.beans.CityStateBean' />
<jsp:setProperty name='cityStateBean' property='*'/>
<jsp:forward page='/hospitalsToFind' />
