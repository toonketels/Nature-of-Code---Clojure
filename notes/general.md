# Install


## Getting started

    // @see: https://github.com/quil/quil/wiki/Installing

    // Install leiningen and clojure via brew
    brew update
    brew install leiningenlein

    /**
     * Start new project
     */

    // Create new project
    lein new <project> && cd <project>

    // Edit .project.cli and add
    // [quil "1.6.0"] to dependencies

    // Update dependencies
    lein deps


    // Start repl and use processing
    lein repl

    (use 'quil-core')
    (sketch :setup (fn [] (background 20) (ellipse 50 50 80 80)) :title "The moon delights the night")
