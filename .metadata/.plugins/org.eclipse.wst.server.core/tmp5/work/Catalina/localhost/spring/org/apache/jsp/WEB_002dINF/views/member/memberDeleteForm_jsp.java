/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-09-12 08:27:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberDeleteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1656294608000L));
    _jspx_dependants.put("jar:file:/C:/8_FinalProject_workspace/HomeArtFinal/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;400&display=swap');\r\n");
      out.write("\r\n");
      out.write("	#button{\r\n");
      out.write("		text-align:center;\r\n");
      out.write("		padding-top: 3%;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.logo{\r\n");
      out.write("		width:100%;\r\n");
      out.write("	}\r\n");
      out.write("	.main{\r\n");
      out.write("		width:500px;\r\n");
      out.write("		height:300px;\r\n");
      out.write("		color:black;\r\n");
      out.write("		margin:5%  auto;\r\n");
      out.write("		background-color:white;\r\n");
      out.write("		border-radius: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.originalProfile {\r\n");
      out.write("		width: 80px;\r\n");
      out.write("		height: 80px;\r\n");
      out.write("		object-fit: cover;\r\n");
      out.write("		border-radius: 50%;\r\n");
      out.write("		margin-right: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.title{	\r\n");
      out.write("		font-size:20px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		color:#4F8CD1;\r\n");
      out.write("		padding-left:43%;\r\n");
      out.write("		padding-top:5%;\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	body{\r\n");
      out.write("		background-color:#EBF2FE;\r\n");
      out.write("		font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	td{\r\n");
      out.write("		padding:5px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	<div class=\"main\">\r\n");
      out.write("		<div class=\"title\">\r\n");
      out.write("			회원<span style=\"color:black;\">탈퇴</span><br><br>\r\n");
      out.write("		</div>\r\n");
      out.write("		<form action=\"memberDelete.me\" method=\"post\" id=\"deleteForm\">\r\n");
      out.write("			<table style=\"margin-left:15%;\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>ID</td>\r\n");
      out.write("					<td><input id=\"id\" name=\"id\" type=\"text\" maxlength=\"16\" required autocomplete=\"off\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>비밀번호</td>\r\n");
      out.write("					<td><input id=\"password1\" name=\"password1\" class=\"passowrd\" type=\"password\" maxlength=\"16\" required></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>비밀번호 확인</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input id=\"password2\" name=\"password2\" class=\"password\" type=\"password\" maxlength=\"16\" required>\r\n");
      out.write("						<div id=\"pwCheckResult\"></div>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("			</table>\r\n");
      out.write("			<br>		\r\n");
      out.write("			<hr width=\"80%\">\r\n");
      out.write("			<div id=\"button\">\r\n");
      out.write("				<button onclick=\"history.go(-1);\" style=\"border-radius:5px; width:80px; height:30px;  border:0px; cursor: pointer; color:white; background-color:#4F8CD1;\">이전</button>\r\n");
      out.write("				<button id=\"modify_Btn\" style=\"border-radius:5px; width:80px; height:30px;  border:0px; cursor: pointer; color:white; background-color:#4F8CD1;\">확인</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("		\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("	//비밀번호 정규식패턴 \r\n");
      out.write("// 	$(\"#password1\").change(function(){\r\n");
      out.write("//     	checkPassword($('#password1').val());\r\n");
      out.write("// 	});\r\n");
      out.write("	\r\n");
      out.write("// 	function checkPassword(password){\r\n");
      out.write("    \r\n");
      out.write("//     	if(!/^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/.test(password)){            \r\n");
      out.write("//     		alert('비밀번호는 숫자+영문자+특수문자 조합으로 8~16자리를 입력해야 합니다.');\r\n");
      out.write("//         	$('#password1').val('').focus();\r\n");
      out.write("//         	return false;\r\n");
      out.write("//     	}   \r\n");
      out.write("   	\r\n");
      out.write("// 	    return true;\r\n");
      out.write("// 	} \r\n");
      out.write("	\r\n");
      out.write("	//비밀번호 일치 확인\r\n");
      out.write("	$('.password').on('change paste keyup', function(){			\r\n");
      out.write("		var password1 = $('#password1').val().trim()\r\n");
      out.write("		var password2 = $('#password2').val().trim()\r\n");
      out.write("		if(password1 != \"\" && password2 != \"\") {\r\n");
      out.write("			if(password1 != \"\" && password2 != \"\" && password1 != password2){\r\n");
      out.write("				$('#pwCheckResult').text('비밀번호가 일치하지 않습니다.').css('color', 'red');		\r\n");
      out.write("				$(this).focus();\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("			} else {\r\n");
      out.write("				$('#pwCheckResult').text('비밀번호가 일치합니다.').css('color', 'green');\r\n");
      out.write("				\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	})\r\n");
      out.write("	//탈퇴하기 \r\n");
      out.write("	$('#modify_Btn').on('click', function(){\r\n");
      out.write("		if(confirm(\"정말로 탈퇴하시겠습니까?\")){\r\n");
      out.write("			return true;\r\n");
      out.write("		} else {\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /WEB-INF/views/member/memberDeleteForm.jsp(62,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("memberHeader.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }
}
