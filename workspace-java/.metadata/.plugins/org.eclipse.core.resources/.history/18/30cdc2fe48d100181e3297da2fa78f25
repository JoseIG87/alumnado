var app = angular.module('app', []);

app.controller('postController', function($scope, $http, $location) {
	$scope.submitAlumno = function(){
		$scope.deleteAlumnoResultMessage = "";
		$scope.getAlumnoResultMessage = "";
		$scope.inscripcionResultMessage = "";
		
		var url = $location.absUrl() + "alumnos/guardar";
		
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		
		var data = {
			tipoDoc: $scope.tipoDoc,
			documento: $scope.documento,
			nombre: $scope.nombre,
			apellido: $scope.apellido,
			fechaNac: $scope.fechaNac,
			direccion: $scope.direccion,
			legajo: $scope.legajo
        };
		
		
		$http.post(url, data, config).then(function (response) {
			$scope.enableDelete = false;
			$scope.enableEstadoAcademico = false;
			$scope.postResultMessage = "Alumno Guardado Correctamente!";
		}, function (response) {
			$scope.enableDelete = false;
			$scope.enableEstadoAcademico = false;
			$scope.postResultMessage = "Hubo un error al intentar guardar el alumno";
		});
		
		$scope.tipoDoc = "";
		$scope.documento = "";
		$scope.nombre = "";
		$scope.apellido = "";
		$scope.fechaNac = "";
		$scope.direccion = "";
		$scope.legajo = "";
	}
	
	$scope.getAlumno = function(){
		$scope.postResultMessage = "";
		$scope.deleteAlumnoResultMessage = "";
		$scope.inscripcionResultMessage = "";
		
		var url = $location.absUrl() + "alumnos/obteneralumno/"+$scope.documentoBuscar;
		
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		
		$http.get(url, config).then(function (response) {
			console.log(response);
			$scope.idAlumno = response.data.idAlumno;
			$scope.tipoDoc = response.data.tipoDoc;
			$scope.documento = response.data.documento;
			$scope.nombre = response.data.nombre;
			$scope.apellido = response.data.apellido;
			$scope.fechaNac = response.data.fechaNac;
			$scope.direccion = response.data.direccion;
			$scope.legajo = response.data.legajo;
			$scope.enableDelete = true;
			
			var url2 = $location.absUrl() + "alumnos/datosacademicos/"+$scope.idAlumno;
			
			$http.get(url2, config).then(function (response) {
				console.log(response);
				$scope.enableEstadoAcademico = true;
			}, function (response) {
				$scope.enableEstadoAcademico = false;
			});
			
			$http.get($location.absUrl() + "cursos/obtenercursos", config).then(function (response) {
				console.log(response);
				$scope.cursos = response.data;
				$scope.selectedCourse = "";
				$scope.enableInscribirACurso = true;
			}, function (response) {
				$scope.enableInscribirACurso = false;
			});
			
		}, function (response) {
			$scope.idAlumno = "";
			$scope.tipoDoc = "";
			$scope.documento = "";
			$scope.nombre = "";
			$scope.apellido = "";
			$scope.fechaNac = "";
			$scope.direccion = "";
			$scope.legajo = "";
			$scope.enableDelete = false;
			$scope.enableEstadoAcademico = false;
			$scope.getAlumnoResultMessage = "No se encontro ningun alumno con ese documento";
		});
	}
	
	$scope.deleteAlumno = function(){
		$scope.postResultMessage = "";
		$scope.getAlumnoResultMessage = "";
		$scope.inscripcionResultMessage = "";
		
		var url = $location.absUrl() + "borrar/"+$scope.idAlumno;
		
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		
		$http.delete(url, config).then(function (response) {
			$scope.idAlumno = "";
			$scope.tipoDoc = "";
			$scope.documento = "";
			$scope.nombre = "";
			$scope.apellido = "";
			$scope.fechaNac = "";
			$scope.direccion = "";
			$scope.legajo = "";
			$scope.enableDelete = false;
			$scope.enableEstadoAcademico = false;
			$scope.enableInscribirACurso = false;
			$scope.deleteAlumnoResultMessage = "El alumno ha sido eliminado correctamente";
		}, function (response) {
			$scope.enableDelete = false;
			$scope.enableEstadoAcademico = false;
			$scope.enableInscribirACurso = false;
			$scope.deleteAlumnoResultMessage = "Hubo un error al intentar eliminar el alumno";
		});
	}
	
	$scope.submitAlumnoToCourse = function(){
		$scope.deleteAlumnoResultMessage = "";
		$scope.getAlumnoResultMessage = "";
		$scope.postResultMessage = "";
		
		var url = $location.absUrl() + "alumnos/inscribiralumnoacarrera/"+$scope.idAlumno+"/"+$scope.selectedCourse.id;
		
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		
		$http.post(url, data, config).then(function (response) {
			$scope.selectedCourse = "";
			$scope.inscripcionResultMessage = "El alumno fue inscripto correctamente";
		}, function (response) {
			
			$scope.inscripcionResultMessage = "No se encontro el alumno o el curso";
		});
		
	}
});