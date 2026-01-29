
db = db.getSiblingDB("admin");


db.createUser({
    user: "customer_api",
    pwd: "customer_pwd",
    roles: [
        { role: "readWrite", db: "customer" }
    ]
});