<html>
<head><title>FreeMarker Spring MVC Hello World</title>
<body>
<div id="header">
    <H2>
        FreeMarker Spring MVC Hello World
    </H2>
</div>

<div id="content">
    <fieldset>
        <legend>查询</legend>
        <form name="city" action="query" method="get">
            ID: <input type="text" name="id" /> <br/>
            <input type="submit" value="Query" />
        </form>
    </fieldset>
</div>

<div id="result">
    <#if city??>
        <h3>name: ${city.name}</h3>
        <h3>population: ${city.population}</h3>
        <h3>province: ${city.province}</h3>
    <#else>
        <h3>没有查询结果</h3>
    </#if>
</div>

</body>
</html>