# Bare Bones shadow-cljs + reagent

This is a mini-project to quickly get started with [ClojureScript](https://clojurescript.org) for hacking on a browser app. The project is using:

* [shadow-cljs](https://github.com/thheller/shadow-cljs) for building/compiling and hotreloading ClojureScript
* [Reagent](https://reagent-project.github.io/) - a most excellent ReactJS wrapper.

When you have the project on your machine:

1. Install npm dependencies
   ```
   npm i
   ```
   
   (Or `yarn`, whatever you fancy.)
1. Open the project in your favorite editor with Clojure support, here assuming it is VS Code with [Calva](https://calva.io/)
1. Start the REPL:
   1. Issue the VS Code command: **Calva: Start a project REPL and Connect (a.k.a. Jack-in)
   1. Select the project type: **shadow-cljs**
   1. Select to start the `:app` build (note, you need to tick the checkbox)
      * The Jack-in Terminal opens, showing the progress, when the app build is complete, you'll get a prompt asking for which build to concect tp.
   1. Select to connect to the `:app` build
   1. Open the app in the browser on http://localhost:87000
1. Open the file [src/main/core.cljs](src/main/core.cljs)
1. Issue the VS Code command: **Calva: Load/Evaluate Current File and Dependencies**

You are now ready to start hacking on the app. In the browser you should see this:

![](./shadow-app-running.jpg)

Encouraging you to edit the app. In the file you loaded, [./src/main/core.cljs](./src/main/core.cljs), you'll find the strings. Try edit one of them and then save the file. Check the browser again. This is shadow-cljs doing it's hot-reload thing.

If you are new to Calva and/or Clojure, please consider opening a new VS Code window and issue the VS Code command: **Calva: Fire up the Getting Started REPL**. See [https://calva.io/getting-started/#theres-a-getting-started-repl](https://calva.io/getting-started/#theres-a-getting-started-repl) for what to expect.

## That's it for this mini-project

TODO: Link to some beginner resources here.

Please join the [Clojurians Slack](http://clojurians.net) to get help getting started. Some channels to visit/join:
* `#beginners`
* `#clojurescript`
* `#shadow-cljs`
* `#reagent`
* `calva`

Happy hacking!