<div class="container-fluid">
	<div class="row">
		<nav class="col-sm-3 col-md-2 hidden-xs-down bg-faded sidebar">
			<ul class="nav nav-pills flex-column">
				<li class="nav-item"><a class="nav-link active" href="#">Todos (${processos.size()})
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Reports</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Analytics</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Export</a></li>
			</ul>

			<ul class="nav nav-pills flex-column">
				<li class="nav-item"><a class="nav-link" href="#">Nav item</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Nav item
						again</a></li>
				<li class="nav-item"><a class="nav-link" href="#">One more
						nav</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Another
						nav item</a></li>
			</ul>

			<ul class="nav nav-pills flex-column">
				<li class="nav-item"><a class="nav-link" href="#">Nav item
						again</a></li>
				<li class="nav-item"><a class="nav-link" href="#">One more
						nav</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Another
						nav item</a></li>
			</ul>
		</nav>


		<div class="col-sm-9 col-md-10 col-sm-offset-3 col-md-offset-2 pt-3">
			<div class="row">
				<div class="col-sm-9 col-md-10 offset-sm-3 offset-md-2">
					<h1>Processos</h1>
					<c:forEach items="${processos}" var="processo">
						<div class="col-sm-6 col-md-3">
							<div class="thumbnail" style="min-height: 200px; height: 200px;">
								<div class="caption">
									<div class="row">
										<div class="pull-left"
											style="padding-left: 10px; font-size: 30px;">
											<h3>${processo.nome}</h3>
										</div>
									</div>
									<div class="row">
										<div class="pull-left" style="padding-left: 10px;">
											<p style="height: 40%">${processo.descricao}</p>
										</div>
									</div>
									<div class="row">
										<div class="pull-left"
											style="padding-left: 10px; font-size: 30px;">
											<p>
												<a href="#"><span
													class="glyphicon glyphicon glyphicon-zoom-in"
													style="color: #8cc63f"></span></a>
											</p>
										</div>
										<div class="pull-right"
											style="padding-right: 10px; font-size: 30px">
											<p>
												<a href="#"><span
													class="glyphicon glyphicon glyphicon-play glyphicon-inverse"
													style="color: #1276bb"></span></a>
											</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</div>

