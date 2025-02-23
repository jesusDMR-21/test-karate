function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  
  var config = {
    env: env,
    swaggerUrl : 'https://petstore.swagger.io'
  }

  if (!env) {
    env = 'dev';
  }
  
  if (env == 'dev') {
    //
  } 
  else if (env == 'e2e') {
    //
  }

  return config;
}