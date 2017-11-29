<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="form-group">
		<label class="control-label col-md-3">Country</label>
		<div class="col-md-4">
			<div class="select2-container col-md-12 full-width-fix"
				id="s2id_country_select">
				<a href="javascript:void(0)" onclick="return false;"
					class="select2-choice select2-default" tabindex="-1"> <span
					class="select2-chosen">Select your country</span><abbr
					class="select2-search-choice-close"></abbr> <span
					class="select2-arrow"><b></b></span></a><input
					class="select2-focusser select2-offscreen" type="text"
					id="s2id_autogen1">
			</div>
			<select name="country" id="country_select"
				class="col-md-12 full-width-fix select2-offscreen" tabindex="-1">
				<option value=""></option>
				<option value="EH">Western Sahara</option>
				<option value="YE">Yemen</option>
				<option value="ZM">Zambia</option>
				<option value="ZW">Zimbabwe</option>
			</select>
		</div>
	</div>

</body>
</html>