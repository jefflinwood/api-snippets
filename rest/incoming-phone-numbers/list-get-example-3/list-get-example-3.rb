# Get twilio-ruby from twilio.com/docs/ruby/install
require 'rubygems'          # This line not needed for ruby > 1.8
require 'twilio-ruby'

# Get your Account Sid and Auth Token from twilio.com/user/account
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = '{{ auth_token }}'
@client = Twilio::REST::Client.new account_sid, auth_token

# Loop over numbers and print out a property for each one
@client.account.incoming_phone_numbers.list({
    :phone_number => "867"}).each do |number|
    puts number.voice_url
end