# ComposeStateManagement
In this we have implemented State Management State hoisting. And Also discuss state full and state less composable functions. 
State Hoisting:

Definition: State hoisting is a concept in functional programming where the state of a component or function is moved to a higher-level component or function to maintain a clear separation between stateful and stateless components.
Purpose: It helps improve the predictability and testability of code by separating state management from rendering logic. State hoisting is often used in React and other component-based frameworks.
State Management:

Definition: State management is the process of handling and controlling the data (state) within an application. It involves methods and patterns for storing, updating, and sharing application data.
Purpose: Effective state management ensures that an application's data is consistent, and changes to the state trigger appropriate updates to the user interface. Common state management tools include Redux, MobX, and Context API (in React).
Stateful:

Definition: A stateful component or function in programming maintains and manages its internal state. It can change its behavior and appearance based on the state it holds.
Purpose: Stateful components are used when the behavior of a component needs to be influenced by data changes or user interactions. They are common in class-based components in frameworks like React.
Stateless Composable Functions:

Definition: Stateless composable functions, often referred to as pure or functional components, are functions that take input (props or arguments) and return an output based solely on that input. They don't have internal mutable state.
Purpose: Stateless composable functions are easier to reason about and test because their output depends only on their input. They are a key concept in functional programming and are widely used in modern component-based UI frameworks like React and Flutter.
In summary, state hoisting is about moving state to higher-level components or functions to improve code organization. State management involves handling and controlling application data. Stateful components maintain their internal state, while stateless composable functions focus on producing output based on input without internal state. These concepts are fundamental to building maintainable and scalable applications, particularly in the context of modern UI development.
