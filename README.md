## To run the project

./gradlew build

./gradlew run

# Vehicle API Documentation

## Endpoints

### GET `/`

Returns a greeting message.

### GET `/vehicle/lock`

Locks the vehicle and returns the lock status.

### GET `/vehicle/unlock`

Unlocks the vehicle and returns the lock status.

### GET `/vehicle/ventilation/start`

Starts the vehicle's ventilation and returns the ventilation status.

### GET `/vehicle/ventilation/stop`

Stops the vehicle's ventilation and returns the ventilation status.

### GET `/vehicle/ventilation/status`

Returns the vehicle's ventilation status.

### GET `/vehicle/`

Returns the vehicle's status in JSON format.

### GET `/vehicle/charging/`

Returns the vehicle's charging status in JSON format.

### GET `/vehicle/charging/profiles`

Returns the vehicle's charging profiles in JSON format.

### GET `/vehicle/equipment`

Returns the vehicle's equipment details in JSON format.

### GET `/vehicle/air-conditioning`

Returns the vehicle's air conditioning details in JSON format.

### GET `/chargingSessions`

Returns the vehicle's charging sessions in JSON format.

### GET `/vehicle/air-conditioning/increaseTemperature`

Increases the vehicle's temperature and returns the updated ventilation status.

### GET `/vehicle/air-conditioning/decreaseTemperature`

Decreases the vehicle's temperature and returns the updated ventilation status.

### GET `/vehicle/location`

Returns the vehicle's location in JSON format.

## Response Format

All endpoints return data in JSON format.