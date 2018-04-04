<!doctype html>
<html>
<head>
<meta name="layout" content="main"/>
<title>Management Page</title>
<asset:stylesheet src="home.css"/>
</head>
<body>
<div id="content" role="main">
<div class="row">

<div class="first">
<h3>Task Management</h3>
<p>Here you can manage tasks.</p>
<button type="button" class="btn btn-success">
<g:link controller="Task" action="create">Add Task</g:link>
</button>
</div>

<div class="second">
<h3>Shift Management</h3>
<p>Here you can manage shifts.</p>
<button type="button" class="btn btn-success">
<g:link controller="Shift" action="create">Add Shift</g:link>
</button>
</div>

<div class="first">
<h3>TeamLeader Management</h3>
<p>Here you can manage team leaders.</p>
<g:link controller="TeamLeader" action="create">Add Team Leader</g:link>
</button>
</div>

<div class="second">
<h3>Team Management</h3>
<p>Here you can manage teams.</p>
<button type="button" class="btn btn-success">
<g:link controller="Team" action="create">Add Team</g:link>
</button>
</div>

<div class="first">
<h3>Employee Management</h3>
<p>Here you can manage employees.</p>
<button type="button" class="btn btn-success">
<g:link controller="Employee" action="create">Add Employee</g:link>
</button>
</div>

</div>
</div>
</body>
</html>
