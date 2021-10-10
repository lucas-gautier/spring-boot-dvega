# Reddit Clone with Spring Boot
*Dan Vega's Udemy course tutorial project*
<hr>

## How to Run with podman
Start the container in the root of this repository. RedHat's s2i OpenJDK image will start the SpringBoot jar bind mounted from the host, in /deployments.

```dockerfile
podman run --volume=./build/libs:/deployments:Z \
    --publish=8080:8080 \
    --interactive --tty registry.access.redhat.com/openjdk/openjdk-11-rhel7:latest
```

> The `--volume` flag requires the `:Z` option for SELinux compatability
> https://www.redhat.com/sysadmin/user-namespaces-selinux-rootless-containers