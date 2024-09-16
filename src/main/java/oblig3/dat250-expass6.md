# Experiment 3 - Poll App SPA

## SPA library : React

## Tasks
I set up the vite project and did my best to set up the components. 
Though i did find it difficult to create the components without understanding how the data was fetched. 
So a lot of the time was spent going back and forth making sure it was working. 
I had a lot of trouble making everything work, taking a lot more time than expected. 
Building went without issue. The poll posting didn't work afterwards. But i just removed the page reload and it worked.

## Weird features
You can "log in" by typing in the username of a user. The votes & polls sent are thus depenant on who you're logged in as.
Default user: Home

## Outstanding issues
Since the relationship between votes, voteoptions & polls isn't correctly modled. I had issues highlighting the chosen option. 
I aslo didn't have the time to leave it at a satisfactory state. When voting, the HTTP requests are sent and reccived correctly, 
though there isn't much feedback in the UI. You're also only allowed to create polls of up to 3 options due to not having the time to find a way of procedually adding & removing input fields and modifying the JSON message. 

## Links
oblig 1 code : was commented out
https://github.com/CitrusLL/DAT250Demo/tree/main/src/main/java/demo 

oblig 2 code : slightly modified. Used as backend
https://github.com/CitrusLL/DAT250Demo/tree/main/src/main/java/oblig2 

## Issues
Most of my issues were down to not understanding React and banging my head against a brick wall repeatedly. I also did have issues with some of my HTTP POST request giving me error 415. But i realised i hadn't specified the media type in the header. 

Also i might not show up for the lecture tomorrow due to how much more frustrating this was to implement than i expected