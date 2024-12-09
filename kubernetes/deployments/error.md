One or more containers do not have resource limits - this could starve other processes
containers: List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.

A single application container that you want to run within a pod.

args (string[])

Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell


One or more containers do not have resource limits - this could starve other processes
name (string)

Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.


One or more containers do not have resource limits - this could starve other processes
ports: List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.

ContainerPort represents a network port in a single container.

containerPort (integer)

Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.

hostIP (string)

One or more containers do not have resource limits - this could starve other processes
containerPort (integer)

Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.


One or more containers do not have resource limits - this could starve other processes
name (string)

Name of the environment variable. Must be a C_IDENTIFIER.

