function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    myVarName: 'someValue'
  }
  if (env == 'dev') {
    config.apiUrl = 'https://reqres.in/api/'

    
  } else if (env == 'e2e') {
    // customize
  }

  return config;
}