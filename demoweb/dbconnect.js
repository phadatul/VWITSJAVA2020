var mongo = require("mongodb");
var mongoclient = mongo.MongoClient;

var url = "mongodb://localhost:27017/mysdbi";

mongoclient.connect(url, { useUnifiedTopology: true }, function(err, db) {
    if (err) throw err;
    console.log("database created successfully....");
    db.close();
});