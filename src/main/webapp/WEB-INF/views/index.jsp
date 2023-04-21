<html>
<body>
<h2>Hello World!</h2>
</body>
<a href="/Hello1">Hello1</a>

<button onclick="Hello2()">Hello2</button>


<a href="/req-param1?name=Galaxy&age=30">파라미터 전송</a>

<script>
const Hello2 = () => {
    location.href = "/Hello2";
}
</script>
</html>
