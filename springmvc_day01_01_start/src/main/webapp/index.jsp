<html>
<body>
<h2>requestmapping</h2>
</body>
<%--第一种方式访问--%>
<a href="${pageContext.request.contextPath}/account/findAccount">findAccount</a>
<%--第二种方式访问--%>
<a href="/account/findAccount">findAccount1</a>

<h2>saveAccount</h2>
<form action="/account/saveAccount" method="post">
    <input type="submit" value="saveAccount,post">
</form>

<h2>deleteAccount</h2>
<%--请求参数示例--%>
<a href="/account/deleteAccount?accountName=zhangsan&money>100">delete100</a>
<a href="/account/deleteAccount?accountName=zhangsan&monry>150">delete150</a>

<a href="/account/findAccount1?accountId=10">findAccount2</a>
<a href="/account/findAccount2?accountId=10&accountName=zhangsan">findAccount3</a>
<form action="/account/findAccount3" method="post">
    accountName:<input type="text" name="name"><br/>
    accountMoney:<input type="text" name="money"><br/>
    AccountProvinceName:<input type="text" name="address.provinceName"><br/>
    accountCityName:<input type="text" name="address.cityName"><br/>
    <input type="submit" value="save">
</form>

<hr/>

<!-- POJO 类包含集合类型演示 -->
<form action="/account/findAccount4" method="post">
    username:<input type="text" name="username"><br/>
    password:<input type="password" name="password"><br/>
    age:<input type="text" name="age"><br/>
    account1name:<input type="text" name="accounts[0].name"><br/>
    account1price:<input type="text" name="accounts[0].money"><br/>
    account2name:<input type="text" name="accounts[1].name"><br/>
    account2price:<input type="text" name="accounts[1].money"><br/>
    account3name:<input type="text" name="accountMap['one'].name"><br/>
    account3price:<input type="text" name="accountMap['one'].money"><br/>
    account4name:<input type="text" name="accountMap['two'].name"><br/>
    account4price:<input type="text" name="accountMap['two'].money"><br/>
    <input type="submit" value="save">
</form>
<hr/>
<a href="/account/deleteByDate?date=2018-11-11">deletedate</a>


<!-- 原始 ServletAPI 作为控制器参数 -->
<hr/>
<a href="account/testServletAPI">ServletAPI</a>

<a href="/account/testRequestParam?name=zhangsan">RequestParam</a>
<hr/>
<form action="account/useRequestBody" method="post">
    username:<input type="text" name="username"><br/>
    password:<input type="password" name="password"><br/>
    age<input type="text" name="age"><br/>
    <input type="submit" value="save">
</form>
<!-- PathVariable 注解 -->
<a href="/account/usePathVariable/100">usePathVariable</a>
<br/>
<br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<hr/>
<form action="account/testRestPOST" method="post">
    username:<input type="text" name="username"><br/>
    <!-- <input type="hidden" name="_method" value="POST"> -->
    <input type="submit" value="save">
</form>
<hr/>
<!-- 更新 -->
<form action="account/testRestPUT/1" method="post">
    username:<input type="text" name="username"><br/>
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="update">
</form>
<hr/>
<!-- 删除 -->
<form action="account/testRestDELETE/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="delete">
</form>
<hr/>
<!-- 查询一个 -->
<form action="account/testRestGET/1" method="post">
    <input type="hidden" name="_method" value="GET">
    <input type="submit" value="find">
</form>
</html>
