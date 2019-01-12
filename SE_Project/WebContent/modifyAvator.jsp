<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="Begin.jsp"%>


        <div class="my-3 my-md-5">
          <div class="container">
            <div class="page-header">
              <h1 class="page-title">
                头像设置 
              </h1>
          </div>
            
            <div class="card">
              <form class="card" action="#">
                <div class="card-body">
                  <h3 class="card-title">编辑头像</h3>
                  <div class="row">
                    <div class="col-md-5">
                     <div class="form-group">
                     <div class="col-auto">
                          <div class="avatar avatar-xl" style="background-image: url(demo/faces/female/9.jpg)"></div>
                      </div>
                      </div>
                      <div class="form-group">
                      <div class="custom-file">
                      <input type="file" class="custom-file-input" name="avator">
                      <label class="custom-file-label">Choose file</label>
                      </div>
                      </div>
                   
                  </div>
                </div>
               <div class="form-group">
                  <button type="submit" class="btn btn-primary">提&nbsp;交</button>
                </div>
              </form>



      <%@include file="End.jsp"%>