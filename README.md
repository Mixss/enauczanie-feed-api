# eNauczanie Feed API

This application is the REST API for the eNauczanieFeed project. More info can be found at the [frontend repository](https://github.com/Mixss/enauczanie-feed).

## Overview

This API manages the storage and presentation of messages in a feed-like fashion. All messages are returned in JSON with the following sample syntax:
```json
{
    "id":5,
    "message":"Hello, what's up?",
    "author":"Adam",
    "date":1665266400000,
    "image":"https://images.com/my_morning.png"
}
```

## Endpoints
There are different endpoints for retrieving, adding and deleting messages.

**GET REQUESTS**
- `/message/all` - returns all mesages stored in database
- `/message/newest/{n}` - returns *n* newest messages
- `/message/older/{m}/{n}` returns *n* messages beggining from *m*-th newest message

**POST REQUESTS**
- `/message/add` - allows messages to be added in JSON format defined in [overview section](#overview).The `date` field can be left empty, then the timestamp will be set to the current time. If the addition was successful, it will return a JSON message with the message JSON with auto-generated `id` field.
- `/message/delete/{id}` - allows messages to be deleted. If the message with the given `id` exists, it will be deleted; API returns `Message deleted successfully`.
