// Download the twilio-csharp library from twilio.com/docs/csharp/install
using System;
using Twilio;

class Example {
    static void Main (string[] args) {
        // Find your Account Sid and Auth Token at twilio.com/user/account
        const string accountSid = "accountSid";
        const string authToken = "authToken";
        const string serviceSid = "serviceSid";

        //Retrieve the list of channels
        var client = new TwilioIpMessagingClient(accountSid, authToken);
        ChannelResult channels = client.ListChannels(serviceSid);
        Console.WriteLine(channels);
    }
}