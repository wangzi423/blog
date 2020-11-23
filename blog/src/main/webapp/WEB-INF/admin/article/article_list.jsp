<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/common.jsp"%>

<!doctype html>
<head>
	<meta charset="utf-8">
	<style>
		.table th, .table td {
			text-align: center;
			vertical-align: middle!important;
		}
	</style>
	<script src="/js/blog.js"></script>
</head>

<body>
<div id="wrapper">
	<nav class="navbar-default navbar-static-side" role="navigation">
		<div class="sidebar-collapse">
			<ul class="nav" id="side-menu">

				<jsp:include page="../header.jsp" flush="true"></jsp:include>

				<li class="active"><a href="javascript:void(0)"><i
						class="fa fa fa-qrcode"></i> <span class="nav-label">文章管理</span> <span
						class="fa arrow"></span> </a>
					<ul class="nav nav-second-level">
						<li class="active"><a href="articleList">文章列表</a>
						</li>
					</ul></li>
				<li><a href="javascript:void(0)"><i class="fa fa fa-qrcode"></i>
					<span class="nav-label">标签管理</span> <span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li><a href="javascript:void(0)">标签列表</a></li>
					</ul></li>
				<li><a href="javascript:void(0)"><i class="fa fa fa-qrcode"></i>
					<span class="nav-label">链接管理</span> <span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li><a href="javascript:void(0)">链接列表</a></li>
					</ul></li>
				<li><a href="javascript:void(0)"><i class="fa fa fa-qrcode"></i>
					<span class="nav-label">用户管理</span> <span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li><a href="javascript:void(0)">用户列表</a></li>
					</ul></li>
				<li><a href="javascript:void(0)"><i class="fa fa fa-qrcode"></i>
					<span class="nav-label">栏目管理</span> <span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li><a href="admin/category/list">栏目列表</a></li>
					</ul></li>
			</ul>

		</div>
	</nav>

	<div id="page-wrapper" class="gray-bg dashbard-1">
		<div class="row wrapper border-bottom white-bg page-heading">
			<div class="col-lg-10">
				<h2>文章列表</h2>
				<ol class="breadcrumb">
					<li><a href="javascript:void(0)">主页</a></li>
					<li><a href="articleList">文章管理</a></li>
					<li><strong>文章列表</strong></li>
				</ol>
			</div>
			<div class="col-lg-2"></div>
		</div>
		<div class="wrapper wrapper-content animated fadeInRight" style="width: 100%">
			<div class="row">
				<div class="col-lg-12">
					<div class="ibox float-e-margins" >
						<div class="ibox-content">
							<div class="row">
								<div class="col-sm-12">
									<form id="form" class="form-inline" action="/blog/article/articleList" method="post">
										<div class="form-group">
											<label>标签</label>
											<select id="tags" name="tid"
													class="form-control">
												<option value=-1>请选择</option>
												<c:forEach items="${tags}" var="tag">
													<option value="${tag.tid}"
													<c:if test="${queryVo.tid eq tag.tid}">selected</c:if>>${tag.tname}</option>
												</c:forEach>
											</select>
										</div>
										<%--<script>
											$.ajax({
												url : '/blog/queryTags',
												type : 'post',
												dataType : 'json',
												success : function (data) {
												    var content = "<option value=-1>请选择</option>";
													for(var i = 0; i < data.length; i++){
													    content += "<option value="+data[i].tid+">"+data[i].tname+"</option>";
													}
													$('#tags').html(content);
                                                }
											});
										</script>--%>
										<div class="form-group">
											<label>标题</label>
											<input type="text" value="${queryVo.title}" name="title" class="form-control"  placeholder="请输入标题">
										</div>
										<div class="form-group">
											<label>发布时间</label>
											<input type="text"
												   value="<fmt:formatDate value='${queryVo.start}' pattern="yyyy-MM-dd" />"
												   name="start" class="form-control start"  placeholder="开始时间">
											<input type="text"
												   value="<fmt:formatDate value='${queryVo.end}' pattern="yyyy-MM-dd" />"
												   name="end" class="form-control end"  placeholder="截至时间">
										</div>
										<script>
                                            laydate.render({
                                                elem: '.start', //指定元素
                                            });
                                            laydate.render({
                                                elem: '.end', //指定元素
                                            });
										</script>
										<button style="margin-top: 5px" <%--onclick="sub()"--%> type="submit" class="btn btn-primary">查询</button>
										<a style="margin-top: 5px" href="/blog/article/toAddArticle" type="button" class="btn btn-success"
										>新增文章</a>
										<button style="margin-top: 5px" id="del" onclick="deleteBatch($(this))" type="button" class="btn btn-danger alert-api-button alert-btn3"
										>批量删除</button>
									</form>
									<script>
										function sub() {
                                            var content = $("#form").serialize();
                                            content = decodeURIComponent(content ,true);
                                            location.href = "/articleList?" + content;
                                        }
									</script>
								</div>
							</div><br />

							<!-- 表格数据 -->
							<div>
								<table  class="table table-bordered">
									<tr>
										<th>
											<input id="father" value="-1" class="father" type="checkbox" >
										</th>
										<th>编号</th>
										<th>标签</th>
										<th>标题</th>
										<th>发布时间</th>
										<th>更新时间</th>
										<th>操作</th>
									</tr>

									<c:forEach items="${articles}" var="article">
										<tr>
											<td>
												<input class="son" value="${article.aid}" type="checkbox" >
											</td>
											<td>${article.aid}</td>
											<td>${article.tname}</td>
											<td>${article.title}</td>
											<td><fmt:formatDate value="${article.create_time}"
																pattern="yyyy-MM-dd hh:mm:ss" />
											</td>
											<td><fmt:formatDate value="${article.update_time}"
																pattern="yyyy-MM-dd hh:mm:ss" />
											</td>
											<td>
												<button onclick="query($(this),${article.aid})"  class="btn btn-success alert-api-button alert-btn3">查看</button>
												<button onclick="edit($(this),${article.aid})"  class="btn btn-info alert-api-button alert-btn3">编辑</button>
												<button onclick="deleteBatch($(this))"  class="btn btn-danger alert-api-button alert-btn3">删除</button>
											</td>
										</tr>
									</c:forEach>
								</table>
							</div>
							${pages}
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

</div>

</body>

<script>
	//完成全选、反选
   /* $('#father').bind('click',function () {

    });*/
   //attr:自定义属性 prop:固有属性
	$('#father').click(function () {
		if($(this).prop('checked')){
			$('.son').each(function () {
				$(this).prop('checked',true);
            });
		}else{
            $('.son').each(function () {
                $(this).prop('checked',false);
            });
		}
    });

	//是否勾中father复选框
	$('.son').each(function () {
		$(this).click(function () {
			if($('.son:checked').length == $('.son').length){
			    $('#father').prop('checked',true);
			}else{
                $('#father').prop('checked',false);
			}
        });
    });

    /*//复选框操作 attr:自定义属性
    $('#father').click(function () {
        if($(this).prop('checked')){
            //反选
            $(".son").each(function () {
                //attr:自定义属性 prop:固有属性
                $(this).prop('checked',true);
            });
        }else{
            //全选
            $(".son").each(function () {
                //attr:自定义属性 prop:固有属性
                $(this).prop('checked',false);
            });
        }
    });
    //根据son判断father是否勾中
    $('.son').each(function () {
        $(this).click(function () {
            if($('.son:checked').length == $('.son').length){
                $('#father').prop('checked',true);
            }else {
                $('#father').prop('checked',false);
            }
            console.log(count);
        });
    });*/
	//查看
	function query(obj,aid) {
	    if($('.son:checked').length > 1){
            obj.val("只能操作一条记录！");
		}else if($('.son:checked').length == 0){
            obj.val("未选中记录！");
		}else{
	        //根据id查询文章
			location.href = "/blog/article/queryArticleById/"+aid + "/article_view";
		}
    }

    //编辑
    function edit(obj,aid) {
        if($('.son:checked').length > 1){
            obj.val("只能操作一条记录！");
        }else if($('.son:checked').length == 0){
            obj.val("未选中记录！");
        }else{
            //根据id查询文章
            location.href = "/blog/article/queryArticleById/"+aid + "/article_edit";
        }
    }

    //批量删除
	function deleteBatch(obj){
        if($('.son:checked').length == 0){
            obj.val("未选中记录！");
            return;
        }

		if(obj.attr('id') == 'del'){
            obj.val("确认删除选中的"+$('.son:checked').length+
				"条数据吗？");
		}else{
            if($('.son:checked').length > 1){
                obj.val("只能操作一条记录！");
                return;
            }else{
                obj.val("确认删除选中的"+$('.son:checked').length+
                    "条数据吗？");
			}
		}

		//获取勾中记录
		var aids = [];
        $('.son:checked').each(function () {
            //将选中的记录的主键放入数组种
            aids.push($(this).val());
        });
        //向后台发出删除请求
		//join():将数组中的元素默认以,号分割
		obj.attr('formAction',"/blog/article/deleteBatch?aids=" + aids.join());
        // location.href = "/blog/article/deleteBatch?aids=" + aids.join();
	}


</script>


</html>
