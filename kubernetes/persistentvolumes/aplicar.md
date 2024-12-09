Minikube ejecuta Kubernetes dentro de una máquina virtual. Necesitamos asegurarnos de que el directorio /mnt/data/mysql exista dentro de la VM de minikube.

```sh
minikube ssh
```

Dentro de la terminal de la VM de minikube, ejecuta:

```sh
sudo mkdir -p /mnt/data/mysql
sudo chmod -R 777 /mnt/data/mysql
exit
```

## Aplicar PV y PVC

```sh
cd ../persistentvolumes
kubectl apply -f kubernetes/persistentvolumes/mysql-pv.yaml
kubectl apply -f kubernetes/persistentvolumes/mysql-pvc.yaml
```

## Verificar el Estado de PV y PVC
```sh
kubectl get pv -n production
kubectl get pvc -n production
```