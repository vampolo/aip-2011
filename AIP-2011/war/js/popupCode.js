var popupStatus = 0;

// Loading
function loadPopup(){
	if(popupStatus==0){
		$("#backgroundPopup").css({"opacity": "0.5"});
		$("#backgroundPopup").fadeIn("fast");
		$("#popupNotImplemented").fadeIn("fast");
		popupStatus = 1;
	}
}

// Disabling
function disablePopup(){
	if(popupStatus==1){
		$("#backgroundPopup").fadeOut("fast");
		$("#popupNotImplemented").fadeOut("fast");
		popupStatus = 0;
	}
}

// Centering
function centerPopup(){	
	var windowWidth = document.documentElement.clientWidth;
	var windowHeight = document.documentElement.clientHeight;
	var popupHeight = $("#popupNotImplemented").height();
	var popupWidth = $("#popupNotImplemented").width();
	
	$("#popupNotImplemented").css({"position": "absolute", "top": windowHeight/2-popupHeight/2, "left": windowWidth/2-popupWidth/2});
	$("#backgroundPopup").css({"height": windowHeight});
}

// Events
$(document).ready(function(){
	
	$(".notImplemented").click(function(){
		centerPopup();
		loadPopup();
	});
				
	$("#popupNotImplementedClose").click(function(){
		disablePopup();
	});
	
	$("#backgroundPopup").click(function(){
		disablePopup();
	});
	
	$("#gallery").galleria({
        width: 600,
        height: 600
    });
});
