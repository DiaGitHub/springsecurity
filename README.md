# springsecurity

# In-memory user store
One place where user information can be kept is in memory. Suppose you have only a handful of users, none of which are 
to change. In that case, it may be simple enough to define those users as part of the security configuration.


Defining users in an in-memory user store

The in-memory user store is convenient for testing purposes or for very simple applications, but it doesn’t allow for easy editing of users.
If you need to add, remove, or change a user, you’ll have to make the necessary changes and then rebuild and redeploy the application.