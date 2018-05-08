function ajax(method, url, params, fn) {
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if( this.readyState === 4 ) {
			if( this.status === 200 ) {
				fn(this.responseText);
			} else {
				alert('Error Message: ' + this.status + ' ' + this.statusText);
			}
		}
	};
	xhr.open(method, url, true);
	//xhr.setRequestHeader('content-type','application/json; charset=utf-8');
	xhr.send(params);
}

function formSubmit(url, params) {
	var form = document.createElement("form");
	form.setAttribute("method", "post");
	form.setAttribute("action", url);
	form.setAttribute("accept-charset", "UTF-8");

	for( var key in params ) {
		if( params.hasOwnProperty(key) ) {
			var hiddenField = document.createElement("input");
			hiddenField.setAttribute("type", "hidden");
			hiddenField.setAttribute("name", key);
			hiddenField.setAttribute("value", params[key]);

			form.appendChild(hiddenField);
		 }
	}

	document.body.appendChild(form);
	form.submit();
}

function isNull(arg) {
	if( typeof(arg) === 'undefined' || arg === '' || arg === null ) {
		return true;
	} else {
		return false;
	}
}
