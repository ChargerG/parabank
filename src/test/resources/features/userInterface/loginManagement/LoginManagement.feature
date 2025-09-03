# language: es
@FeatureName:LoginManagement
Característica: Registro y autenticación de usuario
  Como usuario nuevo de ParaBank
  Quiero poder registrarme en la plataforma ParaBank
  Para garantizar el ingreso a la plataforma de ParaBank

  @LoginParaBank
  Esquema del escenario: El usuario se registra y luego inicia sesion en ParaBank
    Dado que <usuario> accede a la pagina de registro de ParaBank
    Cuando completa el formulario con datos validos y envia el registro
    Entonces puede iniciar sesion con sus credenciales y acceder al sistema

    Ejemplos: Usuarios que se registraran en ParaBank

      | usuario |
      | Camilo  |
      | Ronald  |
      | Camila  |
      | Nataly  |
      | Isabel  |
      | Sandro  |