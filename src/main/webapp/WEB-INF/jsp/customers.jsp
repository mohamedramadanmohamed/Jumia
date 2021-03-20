<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers</title>
<style type="text/css">
table {
	border-collapse: collapse;
	width: 100%;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

* {
	box-sizing: border-box;
}

#myInput {
	background-image: url('/css/searchicon.png');
	background-position: 10px 10px;
	background-repeat: no-repeat;
	width: 100%;
	font-size: 16px;
	padding: 12px 20px 12px 40px;
	border: 1px solid #ddd;
	margin-bottom: 12px;
}

#myTable {
	border-collapse: collapse;
	width: 100%;
	border: 1px solid #ddd;
	font-size: 18px;
}

#myTable th, #myTable td {
	text-align: left;
	padding: 12px;
}

#myTable tr {
	border-bottom: 1px solid #ddd;
}

#myTable tr.header, #myTable tr:hover {
	background-color: #f1f1f1;
}
</style>
</head>
<body>
	<h1>Customer` Phone Numbers</h1>
	<input type="text" id="myInput" onkeyup="myFunction()"
		placeholder="Search for names.." title="Type in a name">
	<table id="myTable">
		<thead>
			<tr>
				<th>Country</th>
				<th>State</th>
				<th>Code</th>
				<th>Number</th>
			</tr>
		</thead>
		<c:forEach items="${records}" var="record">
			<tr>
				<td><c:out value="${record.country}" /></td>
				<td><c:out value="${record.state}" /></td>
				<td><c:out value="${record.code}" /></td>
				<td><c:out value="${record.number}" /></td>
			</tr>
		</c:forEach>
	</table>

	<script>
		function myFunction() {
			var input, filter, table, tr, td, i;
			input = document.getElementById("myInput");
			filter = input.value.toUpperCase();
			table = document.getElementById("myTable");
			var rows = table.getElementsByTagName("tr");
			for (i = 0; i < rows.length; i++) {
				var cells = rows[i].getElementsByTagName("td");
				var j;
				var rowContainsFilter = false;
				for (j = 0; j < cells.length; j++) {
					if (cells[j]) {
						if (cells[j].innerHTML.toUpperCase().indexOf(filter) > -1) {
							rowContainsFilter = true;
							continue;
						}
					}
				}

				if (!rowContainsFilter) {
					rows[i].style.display = "none";
				} else {
					rows[i].style.display = "";
				}
			}
		}
	</script>

</body>
</body>
</html>