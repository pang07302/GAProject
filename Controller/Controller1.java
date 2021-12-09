// package Controller;
// import Selector.*;
// import Reproducer.*;
// import Mutator.*;
// import Human.*;

// public class Controller1 implements Controller {

// public void startProcess(Selection selection, Crossover crossover, Mutation
// mutation, Population p, String target) {
// boolean flag = true;
// while (flag) {

// // compute the fitness of each DNA sample
// for (int i = 0; i < p.population.length; i++) {
// p.population[i].calculateFitness(target);
// }

// for (int i = 0; i < p.population.length; i++) {
// int n = (int) (p.population[i].fitness * 20);
// for (int k = 0; k < n; k++) {
// matingPool.add(p.population[i]);
// }
// }

// for (int i = 0; i < p.population.length; i++) {
// Couple parents = selection.selectParent(); // RWSelection.selectParent()
// DNA child = crossover.crossOver(parents); // OnePointCrossover.crossOver()
// mutation.mutate(child); // SimpleMutation.mutate()

// if (child.getWord().equals(target)) {
// System.out.println("Bingo! " + child.getWord());
// flag = false;
// System.out.println(matingPool.size());
// }

// p.population[i] = child;
// }
// }
// }
// }
