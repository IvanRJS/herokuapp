#language:es
#Autor: Ivan Jimenez
@Tag0
Característica: Aplicativo herokuapp
  Como paciente
  Quiero realizar la solicitud de una cita médica
  A través del sistema de Administración de Hospitales

  Antecedentes:
    Dado que Ivan quiere ingresar al sitio herokuapp

  @Tag1
  Escenario: Realizar el Registro de un Doctor
    Y que Ivan necesita registrar un nuevo doctor
    Cuando el realiza el registro del doctor en el aplicativo de Administracion de Hospitales
      | nombre | apellidos | telefono | tipoDocumento        | nroDocumento |
      | James  | Stevens   | 555666   | Cédula de ciudadanía | 89013597      |
    Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente.


  @Tag2
  Escenario: Realizar el Registro de un Paciente
    Y que Ivan necesita registrar un nuevo paciente
    Cuando el realiza el registro del paciente en el aplicativo de Administracion de Hospitales
      | nombre | apellidos | telefono | tipoDocumento        | nroDocumento | saludPrepagada  |
      | Mike   | Smith     | 555666   | Cédula de ciudadanía | 8901587      | Salud prepagada |

    Entonces el verifica que en pantalla se presente el mensaje Datos guardados correctamente.


  @Tag3
  Escenario: Realizar el Agendamiento de una Cita
    Y que Ivan necesita asistir al medico
    Cuando el realiza el agendamiento de una Cita
      | diaCita          | documentoPaciente | documentoDoctor | observaciones  |
      | June 8 2021 | 8901587            | 89013597         | cita de prueba |

    Entonces el verifica que se muestre en pantalla el mensaje Datos guardados correctamente.

