$(document).ready(function(){
	$('ul.tabs2 li a:first').addClass('active2');
	$('.secciones2 article').hide();
	$('.secciones2 article:first').show();

	$('ul.tabs2 li a').click(function(){
		$('ul.tabs2 li a').removeClass('active2');
		$(this).addClass('active2');
		$('.secciones2 article').hide();

		var activeTab = $(this).attr('href');
		$(activeTab).show();
		return false;
	});
});