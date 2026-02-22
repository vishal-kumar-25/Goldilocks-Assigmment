// 9. Design a nice front-end page that take username and password and as input and validate allow
// the user to be authenticated and if user credential is ok, then print success else failure.

<!DOCTYPE html>
<html>
<body>

<form onsubmit="return validate()">
  Username: <input type="text" id="username"><br>
  Password: <input type="password" id="password"><br>
  <input type="submit" value="Login">
</form>

<script>
function validate() {
  let user = document.getElementById("username").value;
  let pass = document.getElementById("password").value;

  if(user === "admin" && pass === "123") {
    alert("Success");
  } else {
    alert("Failure");
  }
  return false;
}
</script>

</body>
</html>