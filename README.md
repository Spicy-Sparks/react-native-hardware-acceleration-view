# react-native-hardware-acceleration-view

React Native hardware acceleration view

## Installation

```sh
npm install react-native-hardware-acceleration-view
```

## Usage

```js
import HardwareAccelerationView from "react-native-hardware-acceleration-view";

// ...

const [accelerated, setAccelerated] = useState(false)

<HardwareAccelerationView accelerated={accelerated}>
    <Animated.View style={animatedStyle} />
</HardwareAccelerationView>
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
