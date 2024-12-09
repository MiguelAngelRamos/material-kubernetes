El mensaje `deployment.apps/mysql unchanged` significa que el archivo 

mysql-deployment.yaml

 no ha cambiado desde la última vez que se aplicó. Por lo tanto, Kubernetes no ha realizado ninguna actualización en el deployment porque no hay cambios que aplicar.

Dado que no ves el deployment en la lista de deployments, es posible que estés mirando en el namespace incorrecto. Tu archivo de deployment especifica el namespace `production`. Para verificar los deployments en ese namespace, usa el siguiente comando:

```sh
kubectl get deployments -n production
```

Para verificar los pods en el namespace `production`, usa:

```sh
kubectl get pods -n production
```

Si necesitas cambiar al namespace `production` por defecto, puedes hacerlo con:

```sh
kubectl config set-context --current --namespace=production
```

Luego, vuelve a ejecutar los comandos para verificar los deployments y pods.