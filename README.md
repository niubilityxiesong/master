# Mars-Rover-TDD

> A programming kata is an exercise which helps a programmer hone his skills through practice and repetition.

## Getting Start
```bash
gradle idea # or ./gradlew idea

# open MarsRover.ipr in Intellij IDEA

# run MarsRoverTest to verify
```

## Requirement

- [ ] 可以通过一串指令操控火星漫游者号可以在平原上移动
- [ ] 火星漫游者号能够接收(L R M)构成的字符串指令，并返回执x行后的位置和方向
- [ ] 火星漫游者号移动过程中不能越过平原的边界
- [ ] 火星漫游者号应该忽略错误的指令

## Test case

- [ ] 火星漫游者号初始位置在(0, 0, N)，接收指令L，结果应当是(0, 0, W)
- [ ] 火星漫游者号初始位置在(0, 0, N)，接收指令R，结果应当是(0, 0, E)
- [ ] 火星漫游者号初始位置在(0, 0, N)，接收指令M，结果应当是(0, 1, N)
- [ ] 火星漫游者号初始位置在(1, 1, W)，接收指令M，结果应当是(0, 1, W)
- [ ] 火星漫游者号初始位置在(0, 0, N)，接收指令RML，结果应当是(1, 0, N)
- [ ] 火星漫游者号初始位置在(0, 0, N)，接收指令RMLRR，结果应当是(1, 0, S)

- [ ] TODO 火星漫游者号初始位置在(0, 0, W)，接收指令M，结果应当是(0, 0, W)
- [ ] TODO 火星漫游者号初始位置在(5, 5, N)，接收指令MRMR，结果应当是(5, 5, S)
- [ ] TODO 火星漫游者号初始位置在(0, 0, N)，接收指令LMLM，结果应当是(0, 0, S)
