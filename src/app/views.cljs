(ns app.views)

(defn home-page []
  [:div#main
    [:section
      [:h1 "Hello, I'm Ayudh"]
      [:h2 "Software engineer"]]
    [:section
      [:p "Work history"]
      [:p "Zegal/DragonLaw Limited: FullStack Developer, June 2021 - Dec 2021"]
      [:p "Quokka Reward Limited: FullStack Developer, Feb 2020 - Dec 2020"]
      [:p "GoGoVan: Backend developer, Aug 2018 - Aug 2019"]]
    [:section
      [:p "Languages I've worked with"]
      [:p "Javascript, Ruby, Python & GoLang"]]
    [:section
      [:p "Languages I've learned"]
      [:p "See above & C++, C#, Java, Rust, Solidity, Clojure"]]
    [:p {:style {:font-weight "bold"}} "Code for website"]
    [:section
      [:code "(defn home-page []
          [:div#main
            [:section
              [:h1 `Hello, I'm Ayudh`]
              [:h2 `Software engineer`]]
            [:section
              [:p 'Work history']
              [:p 'Zegal/DragonLaw Limited: FullStack Developer, June 2021 - Dec 2021']
              [:p 'Quokka Reward Limited: FullStack Developer, Feb 2020 - Dec 2020']
              [:p 'GoGoVan: Backend developer, Aug 2018 - Aug 2019']]
            [:section
              [:p 'Languages I've worked with']
              [:p 'Javascript, Ruby, Python & GoLang']]
            [:section
              [:p 'Languages I've learned']
              [:p 'See above & C++, C#, Java, Rust, Solidity, Clojure']]
            [:p {:style {:font-weight 'bold'}} 'Code for website']
            [:section
              [:code '(defn home-page [] ...)]]])'"]]])

(defn app []
  [home-page])
