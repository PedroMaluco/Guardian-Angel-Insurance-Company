
db = db.getSiblingDB("admin");


db.createUser({
    user: "customer_api",
    pwd: "customer_pass",
    roles: [
        { role: "readWrite", db: "customer_db" }
    ]
});