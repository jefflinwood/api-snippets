# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest.ip_messaging import TwilioIpMessagingClient

# Initialize the Client
account = "ACCOUNT_SID"
token = "AUTH_TOKEN"
client = TwilioIpMessagingClient(account, token) 

# List the channels
service = client.services.get(sid="SERVICE_SID")
for c in service.channels.list():
    print c.sid