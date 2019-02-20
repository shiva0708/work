SCRIPT_DIR="$(dirname "$(readlink -f "$0")")"
echo $SCRIPT_DIR
$SCRIPT_DIR/mvnw spring-boot:run
