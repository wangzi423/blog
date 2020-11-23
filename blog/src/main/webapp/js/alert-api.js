/* DaTouWang URL: www.datouwang.com */
$(function(){
	$('.alert-api-list').css('height',$(window).height());
   	$(window).scroll(function(){

   		if($(window).scrollTop() >= 224){
   			$('.alert-api-list').css({
   				'top' : $(window).scrollTop() - 224
   			})
   		}else{
   			$('.alert-api-list').css({
   				'top' : 0
   			})
   		}
   	})

   	$(document).delegate('.alert_list a','click',function(){
   		$('.alert_list a').removeClass('alert-api-hover');
   		$(this).addClass('alert-api-hover');
   	})

	SyntaxHighlighter.all();

	var M = {

	}

	// 按钮一
	$(document).delegate(".alert-btn1",'click',function(){
		if(M.dialog1){
			return M.dialog1.show();
		}
		M.dialog1 = jqueryAlert({
			'content' : 'hello 程序员...',
			'closeTime' : 2000
		})
	})
	// 按钮二
	$(document).delegate(".alert-btn2",'click',function(){
		if(M.dialog2){
			return M.dialog2.show();
		}
		M.dialog2 = jqueryAlert({
			'content' : 'hello 程 序 员 ...',
			'modal'   : true,
			'buttons' :{
				'确定' : function(){
					M.dialog2.close();
				}
			}
		})
	})
	// 按钮三
	$(document).delegate(".alert-btn3",'click',function(data){
		M.dialog3 = jqueryAlert({
			'title'   : '温馨提示',
			'content' : data.target.value,
			'modal'   : true,
			'width'   : '320',
			'height'   : '150',
			'buttons' :{
				'确定' : function(){
					//关闭窗口
					M.dialog3.close();
					//null 0 NaN undefined true
                   if(data.target.formAction){
                        location.href = data.target.formAction;
					}
                },
				'取消' : function(){
					M.dialog3.close();
				}
			}
		})
	})

	// 按钮四
	$(document).delegate(".alert-btn4",'click',function(){
		if(M.dialog4){
			return M.dialog4.show();
		}
		M.dialog4 = jqueryAlert({
			'title'   : 'alertjs提示1111',
			'content' : '欢迎使用alertjs弹层 ...',
			'modal'   : true,
			'animateType' : '',
			'buttons' :{
				'确定' : function(){
					M.dialog4.close();
				},
				'不使用111111' : function(){
					if(M.dialog41){
						return M.dialog41.show();
					}
					M.dialog41 = jqueryAlert({
						'content' : '祝您找到更好用的...'
					})
				}
			}
		})
	})

	// 按钮五
	$(document).delegate(".alert-btn5",'click',function(){
		if(M.dialog5){
			return M.dialog5.show();
		}
		M.dialog5 = jqueryAlert({
			'content' : alertContent ,
			'modal'   : true,
			'contentTextAlign' : 'left',
			'width'   : '450px',
			'animateType' : 'linear',
			'buttons' :{
				'不同意' : function(){
					M.dialog5.close();
				},
				'同意' : function(){
					if(M.dialog51){
						return M.dialog51.show();
					}
					M.dialog51 = jqueryAlert({
						'content' : '同意也不能注册哦...'
					})
				}
			}
		})
	})

	// 按钮六
	$(document).delegate(".alert-btn6",'click',function(){
		if(M.dialog6){
			return M.dialog6.show();
		}
		M.dialog6 = jqueryAlert({
			'style'   : 'pc',
			'title'   : '捕获页',
			'content' :  $("#alert-blockquote"),
			'modal'   : true,
			'contentTextAlign' : 'left',
			'width'   : 'auto',
			'animateType' : 'linear',
			'buttons' :{
				'关闭' : function(){
					M.dialog6.close();
				},
			}
		})
	})

	// 按钮七
	$(document).delegate(".alert-btn7",'click',function(){
		if(M.dialog7){
			return M.dialog7.show();
		}
		M.dialog7 = jqueryAlert({
			'style'   : 'pc',
			'title'   : 'iframe层',
			'content' :  alertContent,
			'modal'   : true,
			'contentTextAlign' : 'left',
			'width'   : '400',
			'height'  : '300',
			'animateType' : 'linear',
			'buttons' :{
				'关闭' : function(){
					M.dialog7.close();
				},
			}
		})
	})

	// 按钮八
	$(document).delegate(".alert-btn8",'click',function(){
		if(M.dialog8){
			return M.dialog8.show();
		}
		M.dialog8 = jqueryAlert({
			'style'   : 'pc',
			'title'   : 'iframe窗',
			'content' :  $(".alert-box"),
			'modal'   : true,
			'contentTextAlign' : 'left',
			'width'   : '90%',
			'height'  : '90%',
			'animateType': 'scale',
		})
	})


	// 按钮九
	$(document).delegate(".alert-btn9",'click',function(){
		if(M.dialog9){
			return M.dialog9.show();
		}
		M.dialog9 = jqueryAlert({
			'style'   : 'pc',
			'title'   : 'pc弹层',
			'content' :  'PC端普通弹层呦呦呦...',
			'modal'   : true,
			'contentTextAlign' : 'left',
			'animateType': 'scale',
			'bodyScroll' : 'true',
			'buttons' : {
				'关闭' : function(){
					M.dialog9.close();
				},
				'去首页' : function(){
					location.href="http://www.datouwang.com";
				}
			}
		})
	})
})