#language:es
#Autor: Ivan Jimenez
@Tag0
Característica: Aplicativo herokuapp
  Como paciente
  Quiero realizar la solicitud de una cita médica
  A través del sistema de Administración de Hospitales

  @Tag1
  Escenario: Realizar el Registro de un Doctor
    Dado que Ivan necesita registrar un nuevo doctor
    Cuando el realiza el registro del doctor en el aplicativo de Administracion de Hospitales
      | nombre | apellidos | telefono | tipo_documento       | nro_documento |
      | john   | wick      | 555666   | Cédula de ciudadanía | 89012         |
    Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente


  @Tag2
  Escenario: Realizar el Registro de un Paciente
    Dado que Ivan necesita registrar un nuevo paciente
    Cuando el realiza el registro del paciente en el aplicativo de Administracion de Hospitales
      | nombre | apellidos | telefono | tipo_documento       | nro_documento | salud_prepagada |
      | john   | wick      | 555666   | Cédula de ciudadanía | 89012         | salud_prepagada |

    Entonces el verifica que en pantalla se presente el mensaje Datos guardados correctamente


  @Tag3
  Escenario: Realizar el Agendamiento de una Cita
    Dado que Ivan necesita asistir al medico
    Cuando el realiza el agendamiento de una Cita
      | dia_cita         | documento_paciente | documento_doctor | observaciones  |
      | 20 November 2019 | 89012              | 89012            | cita de prueba |

    Entonces el verifica que se muestre en pantalla el mensaje Datos guardados correctamente

