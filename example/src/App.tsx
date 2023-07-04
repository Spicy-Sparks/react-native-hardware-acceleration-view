import * as React from 'react';
import { StyleSheet, View } from 'react-native';
import HardwareAccelerationView from 'react-native-hardware-acceleration-view';

export default function App() {
  return (
    <View style={styles.container}>
      <HardwareAccelerationView accelerated={false} style={styles.box}>
        <View style={styles.boxInner} />
      </HardwareAccelerationView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 120,
    height: 120,
    marginVertical: 20,
    backgroundColor: 'blue',
    alignItems: 'center',
    justifyContent: 'center',
  },
  boxInner: {
    width: 60,
    height: 60,
    backgroundColor: 'azure',
  },
});
