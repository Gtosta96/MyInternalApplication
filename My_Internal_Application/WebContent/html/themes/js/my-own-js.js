/*AJAX CONTENT*/
//AJAX WORKS ON XMLHttpRequest
$(document).ready(function() {
		 $("#btn").click(function() {
		    $.ajax({
		        url: "informativoAjax.txt",
		        async: true,   // asynchronous request? (synchronous requests are discouraged...)
		        cache: false,   // with this, you can force the browser to not make cache of the retrieved data
		        dataType: "text",  // jQuery will infer this, but you can set explicitly
		        success : function (data) {
		        	//content
		        	var dt = new Date();
		        	var time = dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds();
	                $("#ajax-content").html(data + time);
	            }
		    });
		 });
	});

$(document).ready(function(){
	$("#form").hide();
	
	$("#btn2").click(function() {
		if($("#form").css("display") == "none"){
			$("#form").show();
			$(this).html("Enviar");
		}else{
			var nome = $("#nome").val();
			if(nome){
				$("#display-nome").html("Hello " + nome + "!");
			}
		}
	});
});
